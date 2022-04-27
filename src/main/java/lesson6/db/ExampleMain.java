package lesson6.db;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ExampleMain {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        lesson6.db.dao.CategoriesMapper categoriesMapper = session.getMapper(lesson6.db.dao.CategoriesMapper.class);
        lesson6.db.model.CategoriesExample example = new lesson6.db.model.CategoriesExample();
        example.createCriteria().andIdEqualTo(1L);
        List<lesson6.db.model.Categories> list = categoriesMapper.selectByExample(example);
        System.out.println(categoriesMapper.countByExample(example));

        lesson6.db.model.Categories categories = new lesson6.db.model.Categories();
        categories.setTitle("test");
        categoriesMapper.insert(categories);
        session.commit();


        lesson6.db.model.CategoriesExample example1 = new lesson6.db.model.CategoriesExample();
        example1.createCriteria().andTitleLike("test");
        List<lesson6.db.model.Categories> list1 = categoriesMapper.selectByExample(example1);
        lesson6.db.model.Categories categories1 = list1.get(0);
        categories1.setTitle("test000");
        categoriesMapper.updateByPrimaryKey(categories1);
        session.commit();

        categoriesMapper.deleteByPrimaryKey(categories1.getId());
        session.commit();
        session.close();


    }
}
