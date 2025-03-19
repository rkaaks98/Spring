package kr.co.ch07.ch07.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import kr.co.ch07.ch07.entity.shop.Customer;
import kr.co.ch07.ch07.entity.shop.QCustomer;
import kr.co.ch07.ch07.entity.shop.QOrder;
import kr.co.ch07.ch07.entity.shop.QProduct;
import kr.co.ch07.ch07.repository.shop.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ShopRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    private JPAQueryFactory jpaQueryFactory;

    QCustomer qCustomer = QCustomer.customer;
    QProduct qProduct = QProduct.product;
    QOrder qOrder = QOrder.order;

    @Test
    public void test1(){

        List<Customer> customerList = customerRepository.selectAllCustomer();
        System.out.println(customerList);

    }

    @Test
    public void test2(){
        Customer customer = customerRepository.selectCustomer("a101");
        System.out.println(customer);
    }
    @Test
    public void test3(){

    }
    @Test
    public void test4(){

    }
    @Test
    public void test5(){

    }
    @Test
    public void test6(){

    }
    @Test
    public void test7(){

    }
    @Test
    public void test8(){

    }
    @Test
    public void test9(){

    }
    @Test
    public void test10(){

    }@Test
    public void test11(){

    }
    @Test
    public void test12(){

    }
    @Test
    public void test13(){

    }
    @Test
    public void test14(){

    }
    @Test
    public void test15(){

    }
    @Test
    public void test16(){

    }


}
