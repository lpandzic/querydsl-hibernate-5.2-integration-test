package com.github.lpandzic;

import com.querydsl.jpa.sql.JPASQLQuery;
import com.querydsl.sql.SQLServer2012Templates;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import java.util.List;

import static com.github.lpandzic.QFooBar.fooBar;
import static org.assertj.core.api.BDDAssertions.then;

/**
 * MSSQL is required for this test.
 * Make sure docker 4 GB of RAM available.
 * Run `docker run -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=<YourStrong!Passw0rd>' -p 1433:1433 -d microsoft/mssql-server-linux:2017-latest` before test.
 * About ~20 seconds is required for startup.
 * You can run test multiple times without restarting the docker.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Main.class)
public class QuerydslHibernateIntegrationTest {

    @Autowired
    private EntityManager entityManager;

    @Test
    public void shouldExecuteNativeQuery() {

        // when
        List<FooBar> actual = new JPASQLQuery<>(entityManager, SQLServer2012Templates.DEFAULT).select(fooBar)
                                                                                              .from(fooBar)
                                                                                              .fetch();

        // then
        then(actual).isEmpty();
    }
}
