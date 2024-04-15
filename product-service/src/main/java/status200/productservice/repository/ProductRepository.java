package status200.productservice.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import status200.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}