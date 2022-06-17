package drdomir.springframework.msscbeerservice.web.mappers;

import drdomir.springframework.msscbeerservice.domain.Beer;
import drdomir.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * Created by dsavic on 6/4/2022
 */
@Mapper
public interface BeerMapper extends TemplateMapper<Beer, BeerDto> {
}
