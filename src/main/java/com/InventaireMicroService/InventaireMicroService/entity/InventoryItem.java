package com.InventaireMicroService.InventaireMicroService.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mafeki
 */
@Data
@Entity
@Table(name = "item")
public class InventoryItem implements Serializable {

    @Id
    private Long id;
    private String code;
    private String quantite;

}
