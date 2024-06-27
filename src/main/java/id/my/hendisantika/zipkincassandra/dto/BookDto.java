package id.my.hendisantika.zipkincassandra.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-zipkin-cassandra
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/6/24
 * Time: 07:15
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private Long id;
    private String bookName;
    private String writer;
}
