<html xmlns="http://thymeleaf.org">

<head>
    <link th:href="@{/css/bootstrap.min.css}" rel="stylesheet" type="text/css"></link>
    <link th:href="@{/css/layout.css}" rel="stylesheet" type="text/css"></link>
</head>

<body>
    <div class="container">
        <form class="form-horizontal">
            <fieldset>

                <!-- Form Client Name -->
                <legend>Add/Edit Client</legend>

                <!-- Text input-->
                <div class="form-group">
                    <label class="col-md-6 control-label" for="client_name">Client Name</label>
                    <div class="col-md-4">
                        <input id="client_name" name="client_name" type="text" placeholder="Client Name" class="form-control input-md" required="" />
                    </div>
                </div>

				<!-- Text input Client Address-->
                <div class="form-group">
                    <label class="col-md-6 control-label" for="client_address">Client Address</label>
                    <div class="col-md-6">
                        <input id="client_address" name="client_address" type="text" placeholder="Client Address" class="form-control input-md" required="" />
                    </div>
                </div>
                
                <!-- Text input Client Mobile-->
                <div class="form-group">
                    <label class="col-md-6 control-label" for="client_mobile">Client Mobile</label>
                    <div class="col-md-6">
                        <input id="client_mobile" name="client_mobile" type="text" placeholder="Client Mobile" class="form-control input-md" required="" />
                    </div>
                </div>
                
                 <!-- Text input ClientLandline-->
                <div class="form-group">
                    <label class="col-md-6 control-label" for="client_landline">Client Landline</label>
                    <div class="col-md-6">
                        <input id="client_landline" name="client_landline" type="text" placeholder="Client Landline" class="form-control input-md" required="" />
                    </div>
                </div>
                
                <!-- Text input ClientFax-->
                <div class="form-group">
                    <label class="col-md-6 control-label" for="client_fax">Client Fax</label>
                    <div class="col-md-6">
                        <input id="client_fax" name="client_fax" type="text" placeholder="Client Fax" class="form-control input-md" required="" />
                    </div>
                </div>

            <!-- Text input ClientEmail-->
                <div class="form-group">
                    <label class="col-md-6 control-label" for="client_email">Client Email</label>
                    <div class="col-md-6">
                        <input id="client_email" name="client_email" type="text" placeholder="Client Email" class="form-control input-md" required="" />
                    </div>
                </div>
                
                <!-- Text input GSTIN-->
                <div class="form-group">
                    <label class="col-md-6 control-label" for="client_gstin">Client GSTIN</label>
                    <div class="col-md-6">
                        <input id="client_gstin" name="client_gstin" type="text" placeholder="Client GSTIN" class="form-control input-md" required="" />
                    </div>
                </div>
                
                <!-- Button -->
                <div class="form-group">
                    <label class="col-md-4 control-label" for="submit"></label>
                    <div class="col-md-4">
                        <button id="submit" name="submit" class="btn btn-primary btn-login">Login</button>
                    </div>
                </div>

            </fieldset>
        </form>

        <script type="text/javascript" th:src="@{/js/jquery-3.1.0.min.js}"></script>
        <script type="text/javascript" th:src="@{/js/bootstrap.min.js}"></script>
    </div>
    
</body>

</html>