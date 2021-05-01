package com.everis.evaluacion1.Raul.Farias.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.evaluacion1.Raul.Farias.models.Producto;
import com.everis.evaluacion1.Raul.Farias.models.Usuario;
import com.everis.evaluacion1.Raul.Farias.models.Venta;
import com.everis.evaluacion1.Raul.Farias.services.ProductoService;
import com.everis.evaluacion1.Raul.Farias.services.UsuarioService;
import com.everis.evaluacion1.Raul.Farias.services.VentaService;



@RestController
public class ApiController {
	
	@Autowired
	UsuarioService usuarioService;
	@Autowired
	ProductoService productoService;
	@Autowired
	VentaService ventaService;
				
	//insertar
	@RequestMapping(value="/api/usuarios",method= RequestMethod.POST, params = "insertar")
	public Usuario insertUser(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="direccion") String direccion,@RequestParam(value="rut") String rut,
			Model model){
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);		
		usuario.setDireccion(direccion);
		usuario.setRut(rut);
		usuario = usuarioService.insertUser(usuario);			
		return usuario;
	}
	@RequestMapping(value="/api/productos",method= RequestMethod.POST, params = "insertar")
	public Producto insertProduct(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="precio") String precio,@RequestParam(value="descripcion") String descripcion,
			Model model){
		Producto producto = new Producto();
		producto.setNombre(nombre);		
		producto.setPrecio(Integer.parseInt(precio));
		producto.setDescripcion(descripcion);
		producto = productoService.insertProduct(producto);			
		return producto;
	}
	@RequestMapping(value="/api/ventas",method= RequestMethod.POST, params = "insertar")
	public String insertVenta(@RequestParam(value="codigoProducto") String codigoProducto,
			@RequestParam(value="idUsuario") String idUsuario,@RequestParam(value="unidades") String unidades,
			Model model){
		Venta venta = new Venta();
		long maximo = productoService.contadorMax();
		for(long i=0; i<=maximo;i++) {
			if(i==Long.parseLong(codigoProducto)) {
				venta.setCodigoProducto(Long.parseLong(codigoProducto));
				long maximo2 = usuarioService.contadorMax();
				for(long j=0;j<=maximo2;j++) {
					if(j==Long.parseLong(idUsuario)) {
						venta.setIdUsuario(Long.parseLong(idUsuario));
						venta.setUnidades(Integer.parseInt(unidades));
						venta = ventaService.insertVenta(venta);
						return "venta agregada";
					}
				}
			}
		}					
		return "campos erroneos";
	}
	
	//seleccionar
	/* intente aplicar c:ForEach o th:Each para poder listar los objetos de la BD en tablas, 
	 * pero al no poder redirigir la página tuve que desistir*/
	@RequestMapping(value="/api/usuarios",method= RequestMethod.POST, params = "seleccionar")
	public Optional<Usuario> selectUser(@RequestParam(value="id")long id) {
		Optional<Usuario> usuario = usuarioService.selectUser(id);
		return usuario;
	}
	@RequestMapping(value="/api/productos",method= RequestMethod.POST, params = "seleccionar")
	public Optional<Producto> selectProduct(@RequestParam(value="id")long id) {
		Optional<Producto> producto = productoService.selectProduct(id);
		return producto;
	}
	@RequestMapping(value="/api/ventas",method= RequestMethod.POST, params = "seleccionar")
	public Optional<Venta> selectVenta(@RequestParam(value="id")long id) {
		Optional<Venta> venta = ventaService.selectVenta(id);
		return venta;
	}
	
	//eliminar
	//Se cambio el tipo de dato String por Usuario para devolver campos null modificados
	@RequestMapping(value="/api/usuarios",method= RequestMethod.POST, params = "eliminar")
	public Usuario eliminarUsuario(@RequestParam(value="id")long id) {
		Usuario exito = usuarioService.eliminarUsuario(id);
		return exito;
	}
	//Se cambio el tipo de dato String por Producto para devolver campos null modificados
	@RequestMapping(value="/api/productos",method= RequestMethod.POST, params = "eliminar")
	public Producto eliminarProduct(@RequestParam(value="id")long id) {
		Producto exito = productoService.eliminarProduct(id);
		return exito;
	}
	/*en este caso se conservó el deleteByID para mostrar que el codigo funcionaba 
	 * aunque createdAt y updatedAt no tomen significado aqui.
	 */
	@RequestMapping(value="/api/ventas",method= RequestMethod.POST, params = "eliminar")
	public String eliminarVenta(@RequestParam(value="id")long id) {
		String exito = ventaService.eliminarVenta(id);
		return exito;
	}
	
	//actualizar
	@RequestMapping(value="/api/usuarios",method= RequestMethod.POST, params = "actualizarNombre")
	public Usuario actualizarNombre(@RequestParam(value="nombre2")String nombre, @RequestParam(value="id2")long id) {
		Usuario usuario = usuarioService.actualizarNombre(nombre,id);
		return usuario;
	}
	@RequestMapping(value="/api/usuarios",method= RequestMethod.POST, params = "actualizarDireccion")
	public Usuario actualizarDireccion(@RequestParam(value="direccion2")String direccion, @RequestParam(value="id3")long id) {
		Usuario usuario = usuarioService.actualizarDireccion(direccion,id);
		return usuario;
	}
	@RequestMapping(value="/api/productos",method= RequestMethod.POST, params = "actualizarNombre")
	public Producto actualizarNombreP(@RequestParam(value="nombre2")String nombre, @RequestParam(value="id2")long id) {
		Producto producto = productoService.actualizarNombreP(nombre,id);
		return producto;
	}
	@RequestMapping(value="/api/productos",method= RequestMethod.POST, params = "actualizarPrecio")
	public Producto actualizarPrecio(@RequestParam(value="precio2")String precio, @RequestParam(value="id3")long id) {
		Producto producto = productoService.actualizarPrecio(precio,id);
		return producto;
	}
	@RequestMapping(value="/api/productos",method= RequestMethod.POST, params = "actualizarDescripcion")
	public Producto actualizarDescripcion(@RequestParam(value="descripcion2")String descripcion, @RequestParam(value="id4")long id) {
		Producto producto = productoService.actualizarDescripcion(descripcion,id);
		return producto;
	}
	@RequestMapping(value="/api/ventas",method= RequestMethod.POST, params = "actualizarUnidades")
	public Venta actualizarUnidades(@RequestParam(value="unidades2")String unidades, @RequestParam(value="id2")long id) {
		Venta venta = ventaService.actualizarUnidades(unidades,id);
		return venta;
	}
	
	//listar
	@RequestMapping(value="/api/usuarios",method= RequestMethod.POST, params = "listarUsuarios")
	public ArrayList<Usuario> listarUsuarios(){
		ArrayList<Usuario> listaU = usuarioService.allUsers();
		return listaU;
	}
	@RequestMapping(value="/api/productos",method= RequestMethod.POST, params = "listarProductos")
	public ArrayList<Producto> listarProductos(){
		ArrayList<Producto> listaP = productoService.allUsers();
		return listaP;
	}
	@RequestMapping(value="/api/ventas",method= RequestMethod.POST, params = "listarVentas")
	public ArrayList<Venta> listarVentas(){
		ArrayList<Venta> listaV = ventaService.allUsers();
		return listaV;
	}
}
