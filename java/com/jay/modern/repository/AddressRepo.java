package com.jay.modern.repository;
import com.packt.modern.api.entity.AddressEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter09 - Modern API Development with Spring and Spring Boot
 **/
public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {


}
