package br.com.cristolandia.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.cristolandia.repository.entity.FilialEntity;

public class FilialRepository {
	
	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
	
	public FilialRepository(){
		
		/*CRIANDO O NOSSO EntityManagerFactory COM AS PORPRIEDADOS DO ARQUIVO persistence.xml */
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_db_cristolandia");
 
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
	
	/**
	 * CRIA UM NOVO REGISTRO NO BANCO DE DADOS
	 * */
	public void Salvar(FilialEntity filialEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(filialEntity);
		this.entityManager.getTransaction().commit();
	}
 
	/**
	 * ALTERA UM REGISTRO CADASTRADO
	 * */
	public void Alterar(FilialEntity filialEntity){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(filialEntity);
		this.entityManager.getTransaction().commit();
	}
 
	/**
	 * CONSULTA UMA PESSOA CADASTRA PELO CÓDIGO
	 * */
	public FilialEntity GetPessoa(Integer codigo){
 
		return this.entityManager.find(FilialEntity.class, codigo);
	}
 
	/**
	 * EXCLUINDO UM REGISTRO PELO CÓDIGO
	**/
	public void Excluir(Integer codigo){
 
		FilialEntity filial = this.GetPessoa(codigo);
 
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(filial);
		this.entityManager.getTransaction().commit();
 
	}
}
