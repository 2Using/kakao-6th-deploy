package com.example.kakao.order;

import com.example.kakao.MyRestDoc;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
=======
>>>>>>> origin/main
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
<<<<<<< HEAD
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
=======
import org.springframework.test.web.servlet.ResultActions;
>>>>>>> origin/main
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

<<<<<<< HEAD
@AutoConfigureRestDocs(uriScheme = "http", uriHost = "localhost", uriPort = 8080)
=======
>>>>>>> origin/main
@ActiveProfiles("test")
@Sql(value = "classpath:db/teardown.sql")
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class OrderRestControllerTest extends MyRestDoc {
<<<<<<< HEAD

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper om;

    @WithUserDetails(value = "ssarmango@nate.com")
=======
    @Autowired
    private ObjectMapper om;

    @WithUserDetails(value = "ssar@nate.com")
>>>>>>> origin/main
    @Test
    public void order_save_test() throws Exception {


        ResultActions resultActions = mvc.perform(
<<<<<<< HEAD
                MockMvcRequestBuilders
                        .post("/orders/save")
=======
                post("/orders/save")
>>>>>>> origin/main
        );

        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("주문 테스트:" + responseBody);

        resultActions.andExpect(jsonPath("$.success").value("true"));
        resultActions.andExpect(jsonPath("$.response.products[0].productName").value("기본에 슬라이딩 지퍼백 크리스마스/플라워에디션 에디션 외 주방용품 특가전"));
        resultActions.andExpect(jsonPath("$.response.products[0].items[0].optionName").value("01. 슬라이딩 지퍼백 크리스마스에디션 4종"));
        resultActions.andExpect(jsonPath("$.response.products[0].items[1].optionName").value("02. 슬라이딩 지퍼백 플라워에디션 5종"));
        resultActions.andDo(MockMvcResultHandlers.print()).andDo(document);
    }


<<<<<<< HEAD
    @WithUserDetails(value = "ssarmango@nate.com")
    @Test
    public void order_findById_test() throws Exception {
        int id = 1;
        ResultActions resultActions = mvc.perform(
                get("/orders/" + id )
=======
    @Test
    public void order_findById_test() throws Exception {

        ResultActions resultActions = mvc.perform(
                get("/orders/{id}" )
>>>>>>> origin/main
        );

        String responseBody = resultActions.andReturn().getResponse().getContentAsString();
        System.out.println("주문확인 테스트:" + responseBody);

        resultActions.andExpect(jsonPath("$.success").value("true"));
        resultActions.andExpect(jsonPath("$.response.products[0].productName").value("기본에 슬라이딩 지퍼백 크리스마스/플라워에디션 에디션 외 주방용품 특가전"));
        resultActions.andExpect(jsonPath("$.response.products[0].items[0].optionName").value("01. 슬라이딩 지퍼백 크리스마스에디션 4종"));
<<<<<<< HEAD
        resultActions.andExpect(jsonPath("$.response.products[0].items[0].price").value(50000));
=======
        resultActions.andExpect(jsonPath("$.response.price").value(1000));
>>>>>>> origin/main
        resultActions.andDo(MockMvcResultHandlers.print()).andDo(document);
    }

}
