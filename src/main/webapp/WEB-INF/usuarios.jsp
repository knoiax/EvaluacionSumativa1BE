<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuarios</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" 
	rel="stylesheet" 
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" 
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" 
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" 
	crossorigin="anonymous"></script>
</head>
<body>
<nav
  class="navbar navbar-expand-sm navbar-dark bg-dark"
  aria-label="Ejemplo de la tercera barra de navegación"
>
  <div class="container-fluid">
    <a class="navbar-brand" onclick="window.location='/'"
      ><font style="vertical-align: inherit"
        ><font style="vertical-align: inherit"
          >Evaluación sumativa 1</font></font
    ></a>
    <button
      class="navbar-toggler"
      type="button"
      data-bs-toggle="collapse"
      data-bs-target="#navbarsExample03"
      aria-controls="navbarsExample03"
      aria-expanded="false"
      aria-label="Navegación de palanca"
    >
      <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarsExample03">
      <ul class="navbar-nav me-auto mb-2 mb-sm-0 mb-md-0">
        <li class="nav-item">
          <a class="nav-link" aria-current="page" onclick="window.location='usuarios'"
            ><font style="vertical-align: inherit"
              ><font style="vertical-align: inherit"
                >Formulario Usuarios</font
              ></font
            ></a
          >
        </li>
        <li class="nav-item">
          <a class="nav-link" onclick="window.location='productos'"
            ><font style="vertical-align: inherit"
              ><font style="vertical-align: inherit"
                >Formulario Productos</font
              ></font
            ></a
          >
        </li>
        <li class="nav-item">
          <a class="nav-link" onclick="window.location='ventas'"
            ><font style="vertical-align: inherit"
              ><font style="vertical-align: inherit"
                >Formulario Ventas</font
              ></font
            ></a
          >
        </li>
        <li class="nav-item dropdown">
          <a
            class="nav-link dropdown-toggle"
            
            id="dropdown03"
            data-bs-toggle="dropdown"
            aria-expanded="false"
            ><font style="vertical-align: inherit"
              ><font style="vertical-align: inherit"
                >Acerca de nosotros</font
              ></font
            ></a
          >
          <ul class="dropdown-menu" aria-labelledby="dropdown03">
            <li>
              <a
                class="dropdown-item"
                
                ><font style="vertical-align: inherit"
                  ><font style="vertical-align: inherit"
                    >Nuestra historia</font
                  ></font
                ></a
              >
            </li>
            <li>
              <a
                class="dropdown-item"               
                ><font style="vertical-align: inherit"
                  ><font style="vertical-align: inherit"
                    >Misión y visión</font
                  ></font
                ></a
              >
            </li>
            <li>
              <a class="dropdown-item" 
                ><font style="vertical-align: inherit"
                  ><font style="vertical-align: inherit"
                    >Contáctanos</font
                  ></font
                ></a
              >
            </li>
            <li>
              <a class="dropdown-item" 
                ><font style="vertical-align: inherit"
                  ><font style="vertical-align: inherit"
                    >Trabaja con nosotros</font
                  ></font
                ></a
              >
            </li>
          </ul>
        </li>
      </ul>
      <form>
        <input
          class="form-control"
          type="text"
          placeholder="Buscar"
          aria-label="Buscar"
        />
      </form>
    </div>
  </div>
</nav>
<form action="${pageContext.request.contextPath}/api/usuarios" method="POST" class="px-2">
	<div class="container col-md-12">
		<h3 style="text-align: center;">Usuarios</h3><br>
		<div class="row">
	    	<div class="col-md-6">	    
	    		
	    
			      <div class="form-group">
			        <label>Nombre: </label>
			        <input type="text" class="form-control" name="nombre">
			        <br>
			      </div>
	      
			      <div class="form-group">
			        <label>Dirección: </label>
			        <input type="text" class="form-control" name="direccion">
			        <br>
			      </div>
	  
	  
			      <div class="form-group">
			        <label>Rut: </label>
			        <input type="text" class="form-control" id="rut" name="rut">
			      </div><br>
	      
			      <div class="container">
			        <div class="row">
			            <div class="btn-group" role="group" aria-label="Basic mixed styles example">
			                <button type="submit" name="insertar" class="btn btn-success">Insertar</button>
			            </div>
			        </div>
			      </div>  
	      		  <hr>  
	      		  <br> 
			      <div class="form-group">
			        <label>id: </label>
			        <input type="text" class="form-control" name="id">
			        <br>
			      </div>  
	      
	      
			      <div class="container">
			        <div class="row">
			            <div class="btn-group" role="group" aria-label="Basic mixed styles example">
			                <button type="submit" name="seleccionar" class="btn btn-success">seleccionar</button>
			                <button type="submit" name="eliminar" class="btn btn-danger">eliminar</button>
			            </div>		     		       		
			        </div>
			      </div> 
			</div> 
      		<div class="col-md-6">
				<div class="form-group">
			        <label>id: </label>
			        <input type="text" class="form-control" name="id2">
			        <br>
				</div>
			    <div class="form-group">
			        <label>Nombre: </label>
			        <input type="text" class="form-control" name="nombre2">
			        <br>
			    </div>
			    <div class="container">
			        <div class="row">
			            <div class="btn-group" role="group" aria-label="Basic mixed styles example">
			                <button type="submit" name="actualizarNombre" class="btn btn-primary">Actualizar nombre</button>
			            </div>
			        </div>
			    </div> 
	      		<hr>
			    <div class="form-group">
			        <label>id: </label>
			        <input type="text" class="form-control" name="id3">
			        <br>
			    </div>
			    <div class="form-group">
			        <label>Dirección: </label>
			        <input type="text" class="form-control" name="direccion2">
			        <br>
			    </div>
			    <div class="container">
			        <div class="row">
			            <div class="btn-group" role="group" aria-label="Basic mixed styles example">
			                <button type="submit" name="actualizarDireccion" class="btn btn-primary">Actualizar dirección</button>
			            </div>
			        </div>
			    </div>        
	     		<br>	     		      	     
	      	</div>	      	
		</div>	   
	</div>
</form>
</body>
</html>