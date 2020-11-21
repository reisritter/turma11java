package integracao.bancodedados.contatos;

import javax.validation.ConstraintViolationException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import integracao.bancodedados.ContatoModel;
import integracao.bancodedados.IContatoRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ContatosRepositoryIntegrationTest {

	private ContatoModel contato;
	
	@Autowired
	private IContatoRepository contatoRepository;
	
	@Before
	public void start() 
	{
		contato = new ContatoModel();
		contato.setTelefone("1234567");
		contato.setDdd("df");
		contato.setNome("sdf");
	}
	
	@Rule
	public ExpectedException esperadaExcecao = ExpectedException.none();
	
	@Test
	public void salvarComTelNulo() throws Exception
	{
		esperadaExcecao.expect(ConstraintViolationException.class);
		esperadaExcecao.expectMessage("Tel vazio!");
		
		contato.setTelefone(null);
		contatoRepository.save(contato);
	}
	
	
	
}

