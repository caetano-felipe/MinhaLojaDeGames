package generation.com.minhaLojaDeGames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import generation.com.minhaLojaDeGames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByTituloContainingIgnoreCase (String titulo);
}
