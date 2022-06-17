package drdomir.springframework.msscbeerservice.services;

import drdomir.springframework.msscbeerservice.domain.Beer;
import drdomir.springframework.msscbeerservice.repositories.BeerRepository;
import drdomir.springframework.msscbeerservice.web.controler.NotFoundException;
import drdomir.springframework.msscbeerservice.web.mappers.BeerMapper;
import drdomir.springframework.msscbeerservice.web.model.BeerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;
    @Override
    public BeerDto getById(UUID beerId) {
        Optional<Beer> beer = beerRepository.findById(beerId);
        BeerDto beerDto = beerMapper.toDto(beer.orElseThrow(NotFoundException::new));
        return beerDto;
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return beerMapper.toDto(beerRepository.save(beerMapper.toDomain(beerDto)));
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        // verzija 1
        Optional<Beer> beer = beerRepository.findById(beerId);
//        BeerDto beerDtoTemp = beerMapper.toDto(beer.orElseThrow(NotFoundException::new));
//        beerDto.setId(beerDtoTemp.getId());
//        return beerMapper.toDto((beerRepository.save(beerMapper.toDomain(beerDto)));

        // verzija 2
        Beer tmpBeer = beer.orElseThrow(NotFoundException::new);
        tmpBeer.setBeerName(beerDto.getBeerName());
        tmpBeer.setBeerStyle(beerDto.getBeerStyle().name());
        tmpBeer.setPrice(beerDto.getPrice());
        return beerMapper.toDto(beerRepository.save(tmpBeer));
    }
}
