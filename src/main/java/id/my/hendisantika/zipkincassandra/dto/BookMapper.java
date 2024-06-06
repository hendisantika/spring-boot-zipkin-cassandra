package id.my.hendisantika.zipkincassandra.dto;

import id.my.hendisantika.zipkincassandra.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

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
@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "bookName", target = "bookName")
    @Mapping(source = "writer", target = "writer")
    BookDto bookEntityToDto(Book book);
}
