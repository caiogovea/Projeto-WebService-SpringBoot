package com.educandoweb.ProjetoCurso.config;

import com.educandoweb.ProjetoCurso.entities.*;
import com.educandoweb.ProjetoCurso.entities.enums.OrderStatus;
import com.educandoweb.ProjetoCurso.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... strings) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "Harry Potter e a Pedra Filosofal: 1",
                "Primeiro livro da saga Harry Potter, escrito por J.K. Rowling.", 50.0, "");

        Product p2 = new Product(null, "Teclado Mecânico",
                "Teclado gamer com switches mecânicos e iluminação RGB.", 150.0, "");

        Product p3 = new Product(null, "Micro-ondas",
                "Micro-ondas 20L com painel digital e múltiplas funções.", 500.0, "");

        Product p4 = new Product(null, "Computador Gamer",
                "Computador gamer com alto desempenho para jogos atuais.", 3200.0, "");

        Product p5 = new Product(null, "Naruto Gold vol 72",
                "Volume final do mangá Naruto na edição Gold.", 40.0, "");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4));

        p1.getCategories().add(cat2);
        p2.getCategories().add(cat1);
        p2.getCategories().add(cat3);
        p3.getCategories().add(cat1);
        p4.getCategories().add(cat3);
        p5.getCategories().add(cat2);

        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        User u1 = new User(null, "Caio Santos", "caiosantos@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Govea", "alexgovea@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2025-06-20T19:53:07Z"), u1, OrderStatus.PAID);
        Order o2 = new Order(null, Instant.parse("2025-07-21T03:42:10Z"), u2, OrderStatus.WAITING_PAYMENT);
        Order o3 = new Order(null, Instant.parse("2025-07-22T15:21:22Z"), u1, OrderStatus.WAITING_PAYMENT);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
        OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
        OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));

        Payment pay1 = new Payment(null, Instant.parse("2025-06-20T21:53:07Z"), o1);
        o1.setPayment(pay1);

        orderRepository.save(o1);

    }

}
