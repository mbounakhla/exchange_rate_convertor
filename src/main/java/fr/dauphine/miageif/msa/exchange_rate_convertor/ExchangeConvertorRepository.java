package fr.dauphine.miageif.msa.exchange_rate_convertor;

import org.springframework.data.jpa.repository.JpaRepository;




public interface ExchangeConvertorRepository extends JpaRepository<ExchangeRateConvertorEntity, Long> {
    ExchangeRateConvertorEntity findBySourceAndDest(String source, String dest);
}