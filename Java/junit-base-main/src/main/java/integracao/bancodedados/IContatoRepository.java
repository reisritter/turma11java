package integracao.bancodedados;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IContatoRepository extends JpaRepository<ContatoModel,Long> 
{
	
}
