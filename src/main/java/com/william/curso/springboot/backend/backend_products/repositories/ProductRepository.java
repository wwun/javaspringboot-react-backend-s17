package com.william.curso.springboot.backend.backend_products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.william.curso.springboot.backend.backend_products.entities.Product;;

@CrossOrigin(origins = "http://localhost:5173")
@RepositoryRestResource(path="products")    //aplica HATEOAS (hipermedia as the engine of application state)
public interface ProductRepository extends CrudRepository<Product, Long>{
}

//con RepositoryRestResource, cuando se ejecute el get, por ejemplo, listará y mostrará:
// {
//     "_embedded": {   //notar qe este framework genere un _embedded
//         "products": [
//             {
//                 "name": "Monitor Samsung 65",
//                 "description": "el monitor es increible",
//                 "price": 500,
//                 "_links": {
//                     "self": {
//                         "href": "http://localhost:8080/products/1"
//                     },
//                     "product": {
//                         "href": "http://localhost:8080/products/1"
//                     }
//                 }
//             },