<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<style>
	<!--
		body
		{
			position:absolute;
			background-color:#488B6C;
			top:0px;
			left:0px;
			width:100%;
			height:100%;
			visibility:visible;
		}
		
		div#rblock	
		{
			font-family:"Courrier";
			position:absolute;
			top:50%;
			left:50%;
		}
				
		h1
		{
			font-family: "Arial";
		}
	-->
	</style>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Eligibility Info</title>
	</head>
	<body>
		<div id="lblock">
			<img src="https://goo.gl/AFKHhg" width="25%" height="25%" alt="Bank Account"/>
		</div>
		<div id="rblock">
			<h1>Eligibility Info</h1>
			<form class="eligibilityForm" method="post" action="LoanController">
				<!-- User box -->
				<table id="eligibilityTable">
					<tr>
						<td>Account Type</td>
						<td>
							<select name="accountType" required>
								<option value="checking">CHECKING ACCOUNT</option>
								<option value="savings">SAVINGS ACCOUNT</option>
							</select>
						</td>
					</tr>				
					<tr>
						<td>Initial Deposit</td>
						<td><input type="text" name="initialDeposit" required></td>
					</tr>
					<tr>
						<td>Direct Deposit of $500 min monthly</td>
						<td>
							  <input type="radio" name="directDeposit" value="Yes"> Yes
							  <input type="radio" name="directDeposit" value="No"> No
						</td>
					</tr>
						<td>Debit Card Type(VISA/Master/AMEX</td>
						<td>
							<select name="card" required>
								<option value="visa">VISA</option>
								<option value="master">Master Card</option>
								<option value="amex">AMEX</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>Loan Amount Required (in $)</td>
						<td>
							<select name="loanAmount" required>
								<option value="5000">5000</option>
								<option value="10000">10000</option>
								<option value="15000">15000</option>
								<option value="20000">20000</option>
								<option value="25000">25000</option>
							</select>
						</td>
					</tr>
					<tr>
						<td>Rent Lease/Amount</td>
						<td><input type="text" name="rentAmount" required></td>
					</tr>
					<tr>
						<td>Credit Score</td>
						<td>
							<select name="creditScore" required>
								<option value="excellent">Excellent</option>
								<option value="good">Good</option>
								<option value="fair">Fair</option>
								<option value="bad">Bad</option>
							</select>
						</td>
					</tr>
						<td>
<<<<<<< HEAD
							<input type="button" name="previous" value="previous" onclick="location.href='Income_info.jsps'">
							<td align="center"><input type="submit" value="Next"></td>
=======
							<input type="button" name="previous" value="previous" onclick="location.href='IncomeInfo.jsp'">
							<input type="button" name="next" value="next" onclick="location.href='Loaninfo.jsp'">
>>>>>>> branch 'master' of https://github.com/john1787/FinalBankAccount.git
						</td>
					<tr>
				</table>
			</form>
		</div>
	</body>
</html>
