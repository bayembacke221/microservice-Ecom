package sn.bayembacke.paiement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.bayembacke.paiement.be.Paiement;

@Repository
public interface PaiementDao extends JpaRepository<Paiement, Integer>{

    Paiement findByidCommande(int idCommande);
}