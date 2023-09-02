package br.com.senai.cardapiosmktplaceapi.entity;

import java.math.BigDecimal;

import br.com.senai.cardapiosmktplaceapi.entity.enums.Confirmacao;
import br.com.senai.cardapiosmktplaceapi.entity.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "opcoes_cardapios")
@Entity(name = "OpcaoDoCardapio")
public class OpcaoDoCardapio {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_opcao")
	@NotNull(message = "A opção é obrigatória")
	private Opcao opcao;
	
	@EmbeddedId
	@EqualsAndHashCode.Include
	@NotNull(message = "O id da opção d cardápio é obrigatório")
	private OpcaoDoCardapio id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("idDoCardapio")
	@JoinColumn(name = "id_cardapio")
	@NotNull(message = "O cardápio é obrigatório")
	private Cardapio cardapio;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_secao")
	@NotNull(message = "A seção é obrigatória")
	private Secao secao;
	
	@Enumerated(value = EnumType.STRING)
	@NotNull(message = "O status é obrigatório")
	@Column(name = "status")
	private Status status;
	
	@DecimalMin(value = "0.0", inclusive = false, message = "O preço deve ser positivo")
	@Digits(integer = 9, fraction = 2, message = "O preço deve possuir o formato 'NNNNNNNNNN.NN")
	@Column(name = "preco")
	private BigDecimal preco;
	
	@Enumerated(value = EnumType.STRING)
	@NotNull(message = "O indicador de recomendação não pode ser nulo")
	@Column(name = "recomendado")
	private Confirmacao recomendado;
	
	public OpcaoDoCardapio() { 
		this.status = Status.A;
	}
}
