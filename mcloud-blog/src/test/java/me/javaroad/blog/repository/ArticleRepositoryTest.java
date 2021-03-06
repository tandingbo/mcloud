package me.javaroad.blog.repository;

import static org.assertj.core.api.Java6Assertions.assertThat;

import java.util.List;
import me.javaroad.blog.BaseRepositoryTest;
import me.javaroad.blog.entity.Article;
import org.flywaydb.test.annotation.FlywayTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author heyx
 */
@FlywayTest
public class ArticleRepositoryTest extends BaseRepositoryTest {

    @Autowired
    private ArticleRepository articleRepository;

    @Test
    public void findAll() {
        List<Article> articles = articleRepository.findAll();
        assertThat(articles).isNotEmpty();
    }
}