package udemy.hexagonal.adapters.out.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import udemy.hexagonal.adapters.out.client.response.AddressResponse;

@FeignClient(name = "FindAddressByZipCodeClient", url = "${hexagonal.client.address.url}")
public interface FindAddressByZipCodeClient {

    @GetMapping(path = "/{zipCode}")
    AddressResponse find(@PathVariable(name = "zipCode") final String zipCode);
}

