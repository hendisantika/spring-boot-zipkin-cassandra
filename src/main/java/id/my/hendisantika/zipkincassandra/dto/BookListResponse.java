package id.my.hendisantika.zipkincassandra.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-zipkin-cassandra
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/6/24
 * Time: 07:16
 * To change this template use File | Settings | File Templates.
 */
@Getter
@Setter
@Builder
public class BookListResponse {
    private List<BookDto> bookDto;
}
