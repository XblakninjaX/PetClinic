<!DOCTYPE html>

<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags"%>


<html lang="en">

<jsp:include page="fragments/htmlHeader.jsp" />

<body>
	<petclinic:bodyHeader menuName="home" />

	<div class="container-fluid">
		<div class="container xd-container">
			<h2>
				<fmt:message key="welcome" />
			</h2>
			<div class="row">
				<div class="col-md-12">
					<spring:url value="/resources/images/pets.png" htmlEscape="true"
						var="petsImage" />
					<img class="img-responsive" src="${petsImage}" />
				</div>
				<div class="row">
					<div class="col-md-12">
						<br>
					</div>
					<div class="mk-col-1-3">
						<div class="mk-col-1-3">
							<section id="text-2" class="widget widget_text">
								<div class="widgettitle"><b>About Us:</b></div>
								<div class="textwidget">
									<p>TSPi designs and implements secure IT solutions that
										help our customers improve efficiency, increase performance,
										and meet their mission.</p>
									<p>
										We are a <a
											href="http://dsbs.sba.gov/dsbs/search/dsp_profile.cfm?duns=104603696"
											target="_blank">Small Business</a> and hold several federal
										contracts, including <a
											href="http://www.gsaelibrary.gsa.gov/ElibMain/contractorInfo.do?contractNumber=GS-35F-0128Y&contractorName=TECHNOLOGY+SOLUTIONS+PROVIDER%2C+INC.&executeQuery=YES"
											target="_blank">GSA Schedule 70</a>, <a
											href="http://www.gsaelibrary.gsa.gov/ElibMain/contractorInfo.do?contractNumber=GS06F1018Z&contractorName=TECHNOLOGY+SOLUTIONS+PROVIDER%2C+INC.&executeQuery=YES"
											target="_blank">8(a) STARS II</a>, and <a
											href="https://www.sewp.nasa.gov/sewp5public/contractholders#/detail/150"
											target="_blank">NASA SEWP V</a>. Our industry certifications
										include ISO9001, ISO20000, ISO27000, and CMMI Level 3.
									</p>

								</div>

								<petclinic:pivotal />
						</div>
					</div>
					<jsp:include page="fragments/footer.jsp" />
</body>

</html>
