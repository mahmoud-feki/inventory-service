package com.InventaireMicroService.InventaireMicroService.repository;

import com.InventaireMicroService.InventaireMicroService.entity.InventoryItem;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mafeki
 */
@Repository
public interface InventaireRepository extends JpaRepository<InventoryItem, Long> {

    Optional<InventoryItem> findByCode(String code);

}
