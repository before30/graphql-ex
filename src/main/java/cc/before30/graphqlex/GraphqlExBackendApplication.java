package cc.before30.graphqlex;

import graphql.Scalars;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * GraphqlExBackendApplication
 *
 * @author before30
 * @since 2020/03/29
 */

@SpringBootApplication
public class GraphqlExBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraphqlExBackendApplication.class, args);
    }

    @Bean
    GraphQLSchema schema() {
        return GraphQLSchema.newSchema()
                .query(GraphQLObjectType.newObject()
                        .name("query")
                        .field(field -> field
                                .name("test")
                                .type(Scalars.GraphQLString)
                                .dataFetcher(environment -> "response")
                        )
                        .build())
                .build();
    }
}
