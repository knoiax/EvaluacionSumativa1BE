<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Página de inicio</title>
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
<h1 class="display-1">Bienvenido</h1>
</body>
</html>