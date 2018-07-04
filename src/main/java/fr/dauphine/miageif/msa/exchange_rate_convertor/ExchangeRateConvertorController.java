package fr.dauphine.miageif.msa.exchange_rate_convertor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExchangeRateConvertorController {
    @Autowired
    private Environment environment;
    @Autowired
    private ExchangeConvertorRepository repository;

    @PostMapping("/exchange-rate")
    public ExchangeRateConvertorEntity saveTauxChange(@RequestBody ExchangeRateConvertorEntity tauxChange) {
        return repository.save(tauxChange);
    }

    @GetMapping("/exchange-rate")
    public List<ExchangeRateConvertorEntity> findAllTauxChange() {
        return repository.findAll();
    }

    @GetMapping("/exchange-rate/source/{source}/dest/{dest}")
    public ExchangeRateConvertorEntity findTauxChange(@PathVariable String source, @PathVariable String dest) {
        return repository.findBySourceAndDest(source.toUpperCase(), dest.toUpperCase());
    }

    @PostMapping("/exchange-rate/{id}")
    public ExchangeRateConvertorEntity updateTauxChange(@RequestBody ExchangeRateConvertorEntity tauxChange, @PathVariable Long id) {
        tauxChange.setId(id);
        return repository.saveAndFlush(tauxChange);
    }

    @DeleteMapping("/devise-change/{id}")
    public void deleteTauxChange(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
