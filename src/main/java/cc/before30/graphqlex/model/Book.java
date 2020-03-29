package cc.before30.graphqlex.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Book
 *
 * @author before30
 * @since 2020/03/29
 */

@Getter
@Setter
@AllArgsConstructor
public class Book {

    private String title;

    private String isbn;
}
