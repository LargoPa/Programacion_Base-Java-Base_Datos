

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@include file="components/iniciohtml.jsp" %>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyprimeraparte.jsp" %>

    <h1>Alta de Odontólogos</h1>

    <form class="user">
        <div class="form-group row">
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="dni"
                    placeholder="DNI">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="nombre"
                    placeholder="Nombre">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="apellido"
                    placeholder="Apellido">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="telefono"
                    placeholder="Teléfono">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="direccion"
                    placeholder="Dirección">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="fecha_nac"
                    placeholder="Fecha Nac.">
            </div>
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" id="especialidad"
                    placeholder="Especialidad">
            </div>

            <!-- Aca va lo que tiene que ir con horarios -->

        </div>

        <a href="" class="btn btn-primary btn-user btn-block">
            Crear Odontólogo
        </a>

    </form>

<%@include file="components/bodyfinal.jsp" %>