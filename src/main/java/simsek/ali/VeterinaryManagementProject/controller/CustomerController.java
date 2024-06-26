package simsek.ali.VeterinaryManagementProject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import simsek.ali.VeterinaryManagementProject.dto.request.CustomerRequestDto;
import simsek.ali.VeterinaryManagementProject.entity.Customer;
import simsek.ali.VeterinaryManagementProject.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

    public final CustomerService customerService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> findAllCustomers (){
        return customerService.findAllCustomers();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer findCustomerById (@PathVariable Long id){
        return customerService.findCustomerById(id);
    }

    @GetMapping("/searchByName")
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> findCustomersByName (@RequestParam String name){
        return customerService.findCustomersByName(name);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer (@RequestBody CustomerRequestDto customerRequestDto){
        return customerService.createCustomer(customerRequestDto);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Customer updateCustomer (@PathVariable Long id, @RequestBody CustomerRequestDto customerRequestDto){
        return customerService.updateCustomer(id,customerRequestDto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String deleteCustomer(@PathVariable Long id){
        return customerService.deleteCustomer(id);
    }

}
