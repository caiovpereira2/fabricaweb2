package fabricaweb2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fabricadeprogramador.model.Usuario;

public class TesteHibernate {

	public static void main(String[] args) {
		
		//fabrica de entityManager 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("fabricaweb2");

		//gerenciador de entidades (DAO)
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = new Usuario();
		usuario.setNome("Caio");
		usuario.setLogin("caiovpereira2");
		usuario.setSenha("q1w2e3r4");
		
		//abrindo transacao com bd
		em.getTransaction().begin();
		
		//persistindo no bd (prepara a instrucao sql)
		em.persist(usuario);
		
		//instrucao de comando (insert) nesse caso
		em.getTransaction().commit();
	}

}
