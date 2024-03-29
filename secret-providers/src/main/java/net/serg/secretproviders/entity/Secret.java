package net.serg.secretproviders.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Secret {

    @Id
    private String id;
    private String secretText;
}