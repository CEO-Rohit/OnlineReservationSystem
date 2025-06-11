<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cancel Reservation</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card shadow-lg">
                    <div class="card-header bg-danger text-white text-center">
                        <h4>Cancel Your Reservation</h4>
                    </div>
                    <div class="card-body">
                        <form action="CancellationServlet" method="post">
                            <div class="mb-3">
                                <label class="form-label">Enter PNR Number</label>
                                <input type="text" name="pnr" class="form-control" required>
                            </div>
                            <div class="d-grid">
                                <button type="submit" class="btn btn-danger">Cancel Ticket</button>
                            </div>
                        </form>
                    </div>
                    <div class="card-footer text-center">
                        <a href="reservation.jsp" class="text-decoration-none">Back to Reservation</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
