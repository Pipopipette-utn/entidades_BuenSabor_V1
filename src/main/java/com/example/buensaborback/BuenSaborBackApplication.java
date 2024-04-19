package com.example.buensaborback;

import com.example.buensaborback.domain.entities.*;
import com.example.buensaborback.domain.entities.enums.Estado;
import com.example.buensaborback.domain.entities.enums.FormaPago;
import com.example.buensaborback.domain.entities.enums.TipoEnvio;
import com.example.buensaborback.domain.entities.enums.TipoPromocion;
import com.example.buensaborback.repositories.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringBootApplication
public class BuenSaborBackApplication {
// Aca tiene que inyectar todos los repositorios
// Es por ello que deben crear el paquete repositorio

	private static final Logger logger = LoggerFactory.getLogger(BuenSaborBackApplication.class);

	@Autowired
	private PaisRepository paisRepository;

	@Autowired
	private ProvinciaRepository provinciaRepository;

	@Autowired
	private LocalidadRepository localidadRepository;

	@Autowired
	private EmpresaRepository empresaRepository;

	@Autowired
	private SucursalRepository	sucursalRepository;

	@Autowired
	private DomicilioRepository domicilioRepository;

	@Autowired
	private UnidadMedidaRepository unidadMedidaRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ArticuloInsumoRepository articuloInsumoRepository;

	@Autowired
	private ArticuloManufacturadoRepository articuloManufacturadoRepository;

	@Autowired
	private ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;

	@Autowired
	private ImagenRepository imagenRepository;

	@Autowired
	private PromocionRepository promocionRepository;

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private FacturaRepository facturaRepository;

	@Autowired
	private DetallePedidoRepository detallePedidoRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	public static void main(String[] args) {
		SpringApplication.run(BuenSaborBackApplication.class, args);
		logger.info("Estoy activo en el main");
	}

	@Bean
	CommandLineRunner init() {
		return args -> {

			logger.info("----------------ESTOY----FUNCIONANDO---------------------");

			// Etapa del dashboard
			// Crear 1 pais
			Pais argentina = Pais.builder()
					.nombre("Argentina")
					.build();

			paisRepository.save(argentina);

			// Crear 2 provincias para ese pais
			Provincia mendoza = Provincia.builder()
					.nombre("Mendoza")
					.pais(argentina)
					.build();
			Provincia cordoba = Provincia.builder()
					.nombre("Cordoba")
					.pais(argentina)
					.build();

			provinciaRepository.save(mendoza);
			provinciaRepository.save(cordoba);

			// Crear 2 localidades para cada provincia
			Localidad lujanDeCuyo = Localidad.builder()
					.nombre("Lujan de Cuyo")
					.provincia(mendoza)
					.build();
			Localidad godoyCruz = Localidad.builder()
					.nombre("Godoy Cruz")
					.provincia(mendoza)
					.build();
			Localidad achiras = Localidad.builder()
					.nombre("Achiras")
					.provincia(cordoba)
					.build();
			Localidad aguaDeOro = Localidad.builder()
					.nombre("Agua de Oro")
					.provincia(cordoba)
					.build();

			localidadRepository.save(lujanDeCuyo);
			localidadRepository.save(godoyCruz);
			localidadRepository.save(achiras);
			localidadRepository.save(aguaDeOro);

			// Crear 1 empresa
			Empresa empresaBrown = Empresa.builder()
					.nombre("Lo de Brown")
					.cuil(30503167)
					.razonSocial("Venta de Alimentos")
					.build();

			// Crear 2 sucursales para esa empresa
			Sucursal sucursalChacras = Sucursal.builder()
					.nombre("En chacras")
					.horarioApertura(LocalTime.of(17,0))
					.horarioCierre(LocalTime.of(23,0))
					.build();
			Sucursal sucursalGodoyCruz = Sucursal.builder()
					.nombre("En godoy cruz")
					.horarioApertura(LocalTime.of(16,0))
					.horarioCierre(LocalTime.of(23,30))
					.build();

			// Crear los Domicilios para esas sucursales
			Domicilio domicilioViamonte = Domicilio.builder()
					.cp(5509)
					.calle("Viamonte")
					.numero(500)
					.localidad(lujanDeCuyo).build();

			Domicilio domicilioSanMartin = Domicilio.builder()
					.cp(5511)
					.calle("San Martin")
					.numero(789)
					.localidad(godoyCruz).build();

			sucursalChacras.setDomicilio(domicilioViamonte);
			sucursalGodoyCruz.setDomicilio(domicilioSanMartin);

			empresaBrown.getSucursales().add(sucursalChacras);
			empresaBrown.getSucursales().add(sucursalGodoyCruz);

			domicilioRepository.save(domicilioViamonte);
			domicilioRepository.save(domicilioSanMartin);
			sucursalRepository.save(sucursalChacras);
			sucursalRepository.save(sucursalGodoyCruz);
			empresaRepository.save(empresaBrown);

			// Crear Unidades de medida
			UnidadMedida unidadMedidaLitros = UnidadMedida.builder()
					.denominacion("Litros")
					.build();
			UnidadMedida unidadMedidaGramos = UnidadMedida.builder()
					.denominacion("Gramos")
					.build();
			UnidadMedida unidadMedidaCantidad = UnidadMedida.builder()
					.denominacion("Cantidad")
					.build();

			unidadMedidaRepository.save(unidadMedidaLitros);
			unidadMedidaRepository.save(unidadMedidaGramos);
			unidadMedidaRepository.save(unidadMedidaCantidad);

			// Crear Categorías de productos y subCategorías de los mismos
			Categoria categoriaBebidas = Categoria.builder()
					.denominacion("Bebidas")
					.build();

			Categoria categoriaGaseosas = Categoria.builder()
					.denominacion("Gaseosas")
					.build();

			Categoria categoriaTragos = Categoria.builder()
					.denominacion("Tragos")
					.build();

			Categoria categoriaPizzas = Categoria.builder()
					.denominacion("Pizzas")
					.build();

			categoriaBebidas.getSubCategorias().add(categoriaGaseosas);
			categoriaBebidas.getSubCategorias().add(categoriaTragos);

			categoriaRepository.save(categoriaTragos);
			categoriaRepository.save(categoriaGaseosas);
			categoriaRepository.save(categoriaBebidas);
			categoriaRepository.save(categoriaPizzas);

			// Crear Insumos , coca cola , harina , etc
			ArticuloInsumo cocaCola = ArticuloInsumo.builder()
					.denominacion("Coca cola 500cc")
					.unidadMedida(unidadMedidaCantidad)
					.esParaElaborar(false)
					.stockActual(5)
					.stockMinimo(10)
					.stockMaximo(50)
					.precioCompra(700.0)
					.precioVenta(1400.0)
					.build();

			ArticuloInsumo harina = ArticuloInsumo.builder()
					.denominacion("Harina")
					.unidadMedida(unidadMedidaGramos)
					.esParaElaborar(true)
					.stockActual(4)
					.stockMinimo(5000)
					.stockMaximo(40)
					.precioCompra(800.0)
					.build();

			ArticuloInsumo queso = ArticuloInsumo.builder()
					.denominacion("Queso")
					.unidadMedida(unidadMedidaGramos)
					.esParaElaborar(true)
					.stockActual(20)
					.stockMinimo(10000)
					.stockMaximo(50)
					.precioCompra(10000.0)
					.build();

			ArticuloInsumo tomate = ArticuloInsumo.builder()
					.denominacion("Tomate")
					.unidadMedida(unidadMedidaGramos)
					.esParaElaborar(true)
					.stockActual(20)
					.stockMinimo(10000)
					.stockMaximo(50)
					.precioCompra(1000.0)
					.build();

			// crear fotos para cada insumo
			Imagen imagenCoca = Imagen.builder()
					.denominacion("https://m.media-amazon.com/images/I/51v8nyxSOYL._SL1500_.jpg")
					.build();
			Imagen imagenHarina = Imagen.builder()
					.denominacion("https://mandolina.co/wp-content/uploads/2023/03/648366622-1024x683.jpg")
					.build();
			Imagen imagenQueso = Imagen.builder()
					.denominacion("https://superdepaso.com.ar/wp-content/uploads/2021/06/SANTAROSA-PATEGRAS-04.jpg")
					.build();
			Imagen imagenTomate = Imagen.builder()
					.denominacion("https://thefoodtech.com/wp-content/uploads/2020/06/Componentes-de-calidad-en-el-tomate-828x548.jpg")
					.build();

			imagenRepository.save(imagenCoca);
			imagenRepository.save(imagenHarina);
			imagenRepository.save(imagenQueso);
			imagenRepository.save(imagenTomate);

			cocaCola.getImagenes().add(imagenCoca);
			harina.getImagenes().add(imagenHarina);
			queso.getImagenes().add(imagenQueso);
			tomate.getImagenes().add(imagenTomate);

			articuloInsumoRepository.save(cocaCola);
			articuloInsumoRepository.save(harina);
			articuloInsumoRepository.save(queso);
			articuloInsumoRepository.save(tomate);

			// Crear Articulos Manufacturados
			ArticuloManufacturado pizzaMuzarella = ArticuloManufacturado.builder()
					.denominacion("Pizza Muzarella 8 porciones")
					.descripcion("Salsa de tomate, mozzarella fresca de búfala, aceite de oliva y albahaca fresca sobre una base de masa delgada, cocida en horno de leña.")
					.preparacion("")
					.unidadMedida(unidadMedidaCantidad)
					.precioVenta(7500.0)
					.tiempoEstimadoMinutos(15)
					.build();

			ArticuloManufacturado pizzaNapolitana = ArticuloManufacturado.
					builder()
					.denominacion("Pizza Muzarella 8 porciones")
					.descripcion("Salsa de tomate, rodajas de tomate fresco y queso mozzarella derretido sobre una base de masa.")
					.unidadMedida(unidadMedidaCantidad)
					.precioVenta(8000.0)
					.tiempoEstimadoMinutos(15)
					.build();

			// Crear fotos para los artículos manufacturados
			Imagen imagenPizzaMuzarella = Imagen.builder()
					.denominacion("https://storage.googleapis.com/fitia-api-bucket/media/images/recipe_images/1002846.jpg").build();
			Imagen imagenPizzaNapolitana = Imagen.builder()
					.denominacion("https://assets.elgourmet.com/wp-content/uploads/2023/03/8metlvp345_portada-pizza-1024x686.jpg.webp").build();

			imagenRepository.save(imagenPizzaMuzarella);
			imagenRepository.save(imagenPizzaNapolitana);

			pizzaMuzarella.getImagenes().add(imagenPizzaMuzarella);
			pizzaNapolitana.getImagenes().add(imagenPizzaNapolitana);

			ArticuloManufacturadoDetalle harinaDetalle = ArticuloManufacturadoDetalle.builder()
					.cantidad(500.0)
					.articuloInsumo(harina)
					.build();

			ArticuloManufacturadoDetalle quesoDetalle = ArticuloManufacturadoDetalle.builder()
					.cantidad(500.0)
					.articuloInsumo(queso)
					.build();

			ArticuloManufacturadoDetalle tomateDetalle = ArticuloManufacturadoDetalle.builder()
					.cantidad(0.250)
					.articuloInsumo(tomate)
					.build();

			articuloManufacturadoDetalleRepository.save(harinaDetalle);
			articuloManufacturadoDetalleRepository.save(quesoDetalle);
			articuloManufacturadoDetalleRepository.save(tomateDetalle);

			// Establacer las relaciones entre estos objetos.
			pizzaMuzarella.getArticulosManufacturadosDetalles().add(harinaDetalle);
			pizzaMuzarella.getArticulosManufacturadosDetalles().add(quesoDetalle);
			pizzaNapolitana.getArticulosManufacturadosDetalles().add(harinaDetalle);
			pizzaNapolitana.getArticulosManufacturadosDetalles().add(quesoDetalle);
			pizzaNapolitana.getArticulosManufacturadosDetalles().add(tomateDetalle);

			articuloManufacturadoRepository.save(pizzaMuzarella);
			articuloManufacturadoRepository.save(pizzaNapolitana);

			// Establecer relaciones de las categorias
			categoriaGaseosas.getArticulos().add(cocaCola);
			categoriaPizzas.getArticulos().add(pizzaMuzarella);
			categoriaPizzas.getArticulos().add(pizzaNapolitana);

			categoriaRepository.save(categoriaBebidas);
			categoriaRepository.save(categoriaGaseosas);
			categoriaRepository.save(categoriaPizzas);

			// Crear promocion para sucursal - Dia de los enamorados
			// Tener en cuenta que esa promocion es exclusivamente para una sucursal determinada d euna empresa determinada
			Promocion promocionDiaEnamorados = Promocion.builder()
					.denominacion("Dia de los Enamorados")
					.descripcionDescuento("Pizza napolitana + 2 gaseosas coca cola 500cc")
					.tipoPromocion(TipoPromocion.Promocion)
					.fechaDesde(LocalDate.of(2024,2,13))
					.fechaHasta(LocalDate.of(2024,2,15))
					.horaDesde(LocalTime.of(0,0))
					.horaHasta(LocalTime.of(23,59))
					.precioPromocional(10000.0)
					.build();
			promocionDiaEnamorados.getArticulos().add(cocaCola);
			promocionDiaEnamorados.getArticulos().add(cocaCola);
			promocionDiaEnamorados.getArticulos().add(pizzaNapolitana);

			Imagen imagenPromocion = Imagen.builder()
					.denominacion("https://media-cdn.tripadvisor.com/media/photo-s/15/21/4d/55/99-cent-fresh-pizza.jpg")
					.build();

			imagenRepository.save(imagenPromocion);

			promocionDiaEnamorados.getImagenes().add(imagenPromocion);
			promocionRepository.save(promocionDiaEnamorados);

			sucursalGodoyCruz.getPromociones().add(promocionDiaEnamorados);

			//Agregar categorias y promociones a sucursales
			sucursalChacras.getCategorias().add(categoriaBebidas);
			sucursalChacras.getCategorias().add(categoriaGaseosas);
			sucursalChacras.getCategorias().add(categoriaPizzas);

			sucursalGodoyCruz.getCategorias().add(categoriaBebidas);
			sucursalGodoyCruz.getCategorias().add(categoriaGaseosas);
			sucursalGodoyCruz.getCategorias().add(categoriaPizzas);

			sucursalRepository.save(sucursalChacras);
			sucursalRepository.save(sucursalGodoyCruz);

			logger.info("Sucursal Chacras {}",sucursalChacras);
			logger.info("Sucursal Godoy Cruz {}",sucursalGodoyCruz);

			//Agregar Usuario
			Usuario usuario = Usuario.builder().username("argento").auth0Id("iVBORw0KGgoAAAANSUhEUgAAAK0AAACUCAMAAADWBFkUAAABEVBMVEX").build();
			usuarioRepository.save(usuario);

			//Agregar imágen de cliente
			Imagen imagenUsuario = Imagen.builder().denominacion("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQsa2xSPPay4GD7E3cthBMCcvPMADEjFufUWQ&s").build();
			imagenRepository.save(imagenUsuario);

			//agregar domicilios de cliente
			Domicilio domicilioCliente1 = Domicilio.builder().calle("Sarmiento").numero(123).cp(5507).localidad(godoyCruz).build();
			Domicilio domicilioCliente2 = Domicilio.builder().calle("San martin").numero(412).cp(5501).localidad(lujanDeCuyo).build();
			domicilioRepository.save(domicilioCliente1);
			domicilioRepository.save(domicilioCliente2);

			// agregar factura
			Factura factura = Factura.builder().fechaFacturacion(LocalDate.of(2024, 2, 13)).formaPago(FormaPago.MercadoPago).mpMerchantOrderId(1).mpPaymentId(1).mpPaymentType("mercado pago").mpPreferenceId("0001").totalVenta(2500d).build();
			facturaRepository.save(factura);

			// agregar detalle pedido
			DetallePedido detallePedido1 = DetallePedido.builder().articulo(pizzaMuzarella).cantidad(1).subTotal(130d).build();
			DetallePedido detallePedido2 = DetallePedido.builder().articulo(cocaCola).cantidad(1).subTotal(70d).build();

			// agregar pedido
			Pedido pedido = Pedido.builder()
					.domicilio(domicilioCliente1)
					.estado(Estado.Entregado)
					.factura(factura)
					.formaPago(FormaPago.MercadoPago)
					.fechaPedido(LocalDate.of(2024, 4, 18))
					.horaEstimadaFinalizacion(LocalTime.of(12, 30))
					.sucursal(sucursalChacras)
					.tipoEnvio(TipoEnvio.Delivery)
					.total(200d)
					.totalCosto(180d)
					.build();

			pedido.getDetallePedidos().add(detallePedido1);
			pedido.getDetallePedidos().add(detallePedido2);
			pedidoRepository.save(pedido);

			// agregar cliente
			Cliente cliente1 = Cliente.builder().nombre("Alejandro").email("alex@gmail.com").apellido("Lencinas").imagen(imagenUsuario).telefono("2634666666").usuario(usuario).fechaNacimiento(LocalDate.of(1990, 12, 15)).build();
			cliente1.getDomicilios().add(domicilioCliente1);
			cliente1.getDomicilios().add(domicilioCliente2);
			cliente1.getPedidos().add(pedido);
			clienteRepository.save(cliente1);
		};
	}
}



