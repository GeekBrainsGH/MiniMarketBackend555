package ProductTests;

import api.ProductService;
import dto.Product;
import lombok.SneakyThrows;
import okhttp3.ResponseBody;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import utils.RetrofitUtils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PostProductPositiveTest {

    static ProductService productService;
    Product product = null;
    int id;

    @BeforeAll
    static void beforeAll() {productService = RetrofitUtils.getRetrofit().create(ProductService.class);
    }

    @Test
    @SneakyThrows
    void postProductPositiveTest() {
        product = new Product()
                .withTitle("Tomato")
                .withCategoryTitle("Food")
                .withPrice(55);

        Response<Product> response = productService.createProduct(product).execute();

        id = response.body().getId();

        assertThat(response.isSuccessful(), CoreMatchers.is(true));
        assertThat(response.code(), equalTo(201));
        assertThat(response.body().getTitle(), equalTo("Tomato"));
        assertThat(response.body().getCategoryTitle(), equalTo("Food"));
        assertThat(response.body().getPrice(), equalTo(55));
    }



    @SneakyThrows
    @AfterEach
    void tearDown() {
        Response<ResponseBody> response = productService.deleteProduct(id).execute();
        assertThat(response.isSuccessful(), CoreMatchers.is(true));
        assertThat(response.code(), equalTo(200));
    }

}
