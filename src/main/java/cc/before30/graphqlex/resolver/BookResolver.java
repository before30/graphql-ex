package cc.before30.graphqlex.resolver;

import cc.before30.graphqlex.model.Book;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

/**
 * BookResolver
 *
 * @author before30
 * @since 2020/03/29
 */

//@Component
public class BookResolver implements GraphQLQueryResolver {

    public Book getBook(String isbn) {
        return new Book("Learn GrpaphQL", "123456789");
    }

}
