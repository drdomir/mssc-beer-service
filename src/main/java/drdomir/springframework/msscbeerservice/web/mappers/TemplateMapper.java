package drdomir.springframework.msscbeerservice.web.mappers;

/**
 * Created by dsavic on 6/4/2022
 */
public interface TemplateMapper<D, DTO> {
    DTO toDto(D domain);

    D toDomain(DTO dto);
}
