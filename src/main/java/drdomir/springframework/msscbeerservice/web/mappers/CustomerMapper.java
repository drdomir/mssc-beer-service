package drdomir.springframework.msscbeerservice.web.mappers;

import drdomir.springframework.msscbeerservice.domain.Customer;
import drdomir.springframework.msscbeerservice.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by dsavic on 6/4/2022
 */
@Mapper
public interface CustomerMapper extends TemplateMapper<Customer, CustomerDto> {
}
