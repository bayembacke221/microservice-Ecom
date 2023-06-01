package sn.bayembacke.commande.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.bayembacke.commande.model.Commande;

@Repository
public interface CommandesDao extends JpaRepository<Commande, Integer> {
}