package sn.bayembacke.produit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.bayembacke.produit.be.Product;


@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
}