package br.com.java.bean;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ResourceBean {

    private static EntityManagerFactory entityManagerFactory;

    public  static EntityManagerFactory getEntityManagerFactory() { //Cria um entityManager no qual será possível persistir a entidade, deve ser criado somente uma vez
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("veiculo");//Instacia o managerFactory / Esse "lembrete" é declarado dentro do arquivo persistence.xml na tag persistence-unit-name
        }
        return entityManagerFactory;
    }
}
