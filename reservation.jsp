<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Reservation Form</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card shadow-lg">
                    <div class="card-header bg-success text-white text-center">
                        <h4>Train Reservation Form</h4>
                    </div>
                    <div class="card-body">
                        <form action="ReservationServlet" method="post">
                            <div class="row mb-3">
                                <div class="col">
                                    <label class="form-label">Passenger Name</label>
                                    <input type="text" name="name" class="form-control" required>
                                </div>
                                <div class="col">
                                    <label class="form-label">Train Number</label>
                                    <input type="text" name="trainNo" class="form-control" required>
                                </div>
                            </div>

                            <div class="row mb-3">
                                <div class="col">
                                    <label class="form-label">Train Name</label>
                                    <input type="text" name="trainName" class="form-control" required>
                                </div>
                                <div class="col">
                                    <label class="form-label">Class Type</label>
                                    <input type="text" name="classType" class="form-control" required>
                                </div>
                            </div>

                            <div class="row mb-3">
                                <div class="col">
                                    <label class="form-label">Date of Journey</label>
                                    <input type="date" name="date" class="form-control" required>
                                </div>
                            </div>

                            <div class="row mb-3">
                                <div class="col">
                                    <label class="form-label">From (Source)</label>
                                    <input type="text" name="source" class="form-control" required>
                                </div>
                                <div class="col">
                                    <label class="form-label">To (Destination)</label>
                                    <input type="text" name="destination" class="form-control" required>
                                </div>
                            </div>

                            <div class="d-grid">
                                <button type="submit" class="btn btn-success">Book Ticket</button>
                            </div>
                        </form>
                    </div>
                    <div class="card-footer text-center">
                        <a href="cancel.jsp" class="text-decoration-none">Cancel Ticket</a> |
                        <a href="login.jsp" class="text-decoration-none">Logout</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
