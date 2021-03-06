<%-- Author: Ivo Hradek --%>
<%@ tag pageEncoding="utf-8" dynamic-attributes="dynattrs" trimDirectiveWhitespaces="true" %>

<!-- Top navigation bar -->
<nav class="navbar navbar-default navbar-inverse navbar-static-top main" role="navigation">
    <div class="container">
        <!-- Logo and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <buton type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </buton>
            <a href="/pa165">Home</a>
        </div>
        <!-- Navigation -->
        <div class="collapse navbar-collapse navbar-ex1-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="${pageContext.request.contextPath}/hotel/list" role="button">Hotels</a></li>
                <li><a href="${pageContext.request.contextPath}/room/list" role="button">Rooms</a></li>
                <li><a href="${pageContext.request.contextPath}/customer/list" role="button">Customers</a></li>
                <li><a href="${pageContext.request.contextPath}/booking/list" role="button">Booking</a></li>
                <li><a href="/pa165/about.jsp" role="button">About</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Sign In<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">Profile</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="#">Log out</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
