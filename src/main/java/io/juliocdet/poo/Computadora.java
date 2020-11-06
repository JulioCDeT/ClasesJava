package io.juliocdet.poo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Computadora {
    String modelo;
    String marca;
    int ano;
    float peso;
}
