package com.example.kakaoapi.pharmacy.repository

import com.example.kakaoapi.AbstractIntegrationContainerBaseTest
import com.example.kakaoapi.pharmacy.entity.Pharmacy
//import com.example.kakaoapi.pharmacy.service.PharmacyRepositoryService
import org.springframework.beans.factory.annotation.Autowired

import java.time.LocalDateTime

class PharmacyRepositoryTest extends AbstractIntegrationContainerBaseTest {

    @Autowired
    private PharmacyRepository pharmacyRepository

    void setup() {
        pharmacyRepository.deleteAll()
    }

    def "PharmacyRepository save"() {

        given:
        String address = "서울 특별시 성북구 종암동"
        String name = "은혜 약국"
        double latitude = 36.11
        double longitude = 128.11

        def pharmacy = Pharmacy.builder()
                .pharmacyAddress(address)
                .pharmacyName(name)
                .latitude(latitude)
                .longitude(longitude)
                .build()
        when:
        def entity = pharmacyRepository.save(pharmacy)

        then:
        entity.getPharmacyAddress() == address
        entity.getPharmacyName() == name
        entity.getLatitude() == latitude
        entity.getLongitude() == longitude
    }

    def "PharmacyRepository saveAll"() {

        given:
        String address = "서울 특별시 성북구 종암동"
        String name = "은혜 약국"
        double latitude = 36.11
        double longitude = 128.11

        def pharmacy = Pharmacy.builder()
                .pharmacyAddress(address)
                .pharmacyName(name)
                .latitude(latitude)
                .longitude(longitude)
                .build()
        when:
        pharmacyRepositoryService.saveAll(Arrays.asList(pharmacy))
        def result = pharmacyRepository.findAll()

        then:
        result.get(0).getPharmacyAddress() == address
        result.get(0).getPharmacyName() == name
        result.get(0).getLatitude() == latitude
        result.get(0).getLongitude() == longitude
    }

}
