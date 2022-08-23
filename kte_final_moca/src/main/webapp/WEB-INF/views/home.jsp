<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang='ko'>
<!-- 헤더에 제이쿼리, 부트스트랩, 우리가 개별 적용할 css를 위한 custom.css 파일까지 다 적용되어 있음 -->
<%@ include file="/WEB-INF/views/common/header.jsp" %>
<section class="bg-light">
<div id="carousel-cont"class="border-top border-secondary border-5 container-fluid ">
					<div class="row">
						<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
						  <div class="carousel-indicators">
						    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
						    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
						    <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
						  </div>
						  
						  <div class="carousel-inner position-relative">
						    <div class="carousel-item active">
						    	<div class="position-absolute w-100 h-100 bg-dark carousel-wrap"></div>
						      <img src="${path}/resources/images/cafeimage.jpg" class="d-block w-100" alt="...">
						      <div class="carousel-caption d-none d-md-block">
						        <h5>일정을 관리하세요!</h5>
						        <p>일정을 등록하고 모임에 초대한 친구와 겹쳐볼 수 있습니다.</p>
						      </div>
						    </div>
						    
						    <div class="carousel-item">
						   	 <div class="position-absolute w-100 h-100 bg-dark carousel-wrap"></div>	
						      <img src="${path}/resources/images/carousel2.png" class="d-block w-100" alt="...">
						      <div class="carousel-caption d-none d-md-block">
						        <h5>Second slide label</h5>
						        <p>Some representative placeholder content for the second slide.</p>
						      </div>
						    </div>
						    <div class="carousel-item">
						  	  <div class="position-absolute w-100 h-100 bg-dark carousel-wrap"></div>
						      <img src="${path}/resources/images/carousel3.png" class="d-block w-100" alt="...">
						      <div class="carousel-caption d-none d-md-block">
						        <h5>Third slide label</h5>
						        <p>Some representative placeholder content for the third slide.</p>
						      </div>
						    </div>
						  </div>
						  
						  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
						    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
						    <span class="visually-hidden">Previous</span>
						  </button>
						  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
						    <span class="carousel-control-next-icon" aria-hidden="true"></span>
						    <span class="visually-hidden">Next</span>
						  </button>
						</div>
					</div>
				</div>
				<%@ include file="/WEB-INF/views/common/btnHeader.jsp" %>
				

<!-- 			여기서부터 본문 영역 -->
<!-- 			row클래스로 하나의 행을 생성 -->
				<div class="row">
<!-- 				row 클래스 내부에 col-숫자 로 본문 영역의 크기를 나눌 수 있음 -->
<!-- 				한 행은 12칸으로 나뉘며 col-숫자에서 숫자로 몇 칸을 차지할 지 결정(반드시 합이 12가 되어야 함) -->
					<div class="col-6">
						<img src="https://via.placeholder.com/150" class="img-thumbnail" />
						<span>설명</span>
					</div>
					<div class="col-6">
						<img src="https://via.placeholder.com/150" class="img-thumbnail" />
						<span>설명</span>
					</div>
				</div>
<!--			여기 위까지 본문 영역 -->
			<div class="col-2">
<%@ include file="/WEB-INF/views/common/sidebar.jsp" %>
			</div>

<!-- end of container -->
</section>
<%@ include file="/WEB-INF/views/common/footer.jsp" %>
</html>

