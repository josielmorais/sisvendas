package com.sisvendas.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SisvendasApplication {
	
//	@Autowired
//	private CategoriaRepository categoriaRepository;
//	@Autowired
//	private ProdutoRepository produtoRepository;
//	@Autowired
//	private CidadeRepository cidadeRepository;
//	@Autowired
//	private EstadoRepository estadoRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SisvendasApplication.class, args);
	}

	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Categoria cat1 = new Categoria(null,"Informática");
//		Categoria cat2 = new Categoria(null,"Escritório");
//		
//		Produto p1 = new Produto(null, "Computador", 2000.00);
//		Produto p2 = new Produto(null,"Teclado", 800.00);
//		Produto p3 = new Produto(null,"Mouse", 80.00);
//		
//		Estado est1 = new Estado(null, "Minas Gerais");
//		Estado est2 = new Estado(null, "São Paulo");
//		
//		Cidade c1 = new Cidade(null," Uberlândia",est1);
//		Cidade c2 = new Cidade(null," São Paulo",est2);
//		Cidade c3 = new Cidade(null," Campinas",est2);
//		
//		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
//		cat1.getProdutos().addAll(Arrays.asList(p2));
//		
//		p1.getCategorias().addAll(Arrays.asList(cat1,cat2));
//		p2.getCategorias().addAll(Arrays.asList(cat2));
//		p3.getCategorias().addAll(Arrays.asList(cat1));
//		
//		est1.getCidades().addAll(Arrays.asList(c1));
//		est2.getCidades().addAll(Arrays.asList(c2,c3));
//		
//		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
//		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
//		estadoRepository.saveAll(Arrays.asList(est1,est2));
//		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		

	}

}
