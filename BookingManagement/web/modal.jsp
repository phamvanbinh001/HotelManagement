<%-- 
    Document   : modal
    Created on : Jul 10, 2024, 11:57:11 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!-- Success Modal -->
<div class="modal fade" id="successModal" tabindex="-1" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-body text-center">
                <i class="fas fa-check-circle text-success fa-4x mb-3"></i>
                <h5 class="modal-title text-success">Success</h5>
                <p id="successMessage" class="mt-3"></p>
            </div>
        </div>
    </div>
</div>

<!-- Error Modal -->
<div class="modal fade" id="errorModal" tabindex="-1" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-body text-center">
                <i class="fas fa-exclamation-circle text-danger fa-4x mb-3"></i>
                <h5 class="modal-title text-danger">Error</h5>
                <p id="errorMessage" class="mt-3"></p>
            </div>
        </div>
    </div>
</div>

<!-- Confirmation Modal -->
<div class="modal fade" id="confirmModal" tabindex="-1" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Confirmation</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <p id="confirmMessage"></p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-primary" id="confirmButton">Confirm</button>
            </div>
        </div>
    </div>
</div>

<!-- Loading Modal -->
<div class="modal fade" id="loadingModal" tabindex="-1" aria-hidden="true" data-bs-backdrop="static" data-bs-keyboard="false">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-body text-center">
                <div class="spinner-border text-primary" role="status">
                    <span class="visually-hidden">Loading...</span>
                </div>
                <p class="mt-2">Loading...</p>
            </div>
        </div>
    </div>
</div>

<!-- Input Modal -->
<div class="modal fade" id="inputModal" tabindex="-1" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="inputModalTitle">Enter Input</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <input id="inputModalInput" class="form-control" placeholder="Enter your input here">
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-primary" id="inputModalSubmit">Submit</button>
            </div>
        </div>
    </div>
</div>

<script>
    // Function to show success modal
    function showSuccessModal(message, duration = 3000) {
        document.getElementById('successMessage').textContent = message;
        const modal = new bootstrap.Modal(document.getElementById('successModal'));
        modal.show();
        setTimeout(() => modal.hide(), duration);
    }

    // Function to show error modal
    function showErrorModal(message, duration = 3000) {
        document.getElementById('errorMessage').textContent = message;
        const modal = new bootstrap.Modal(document.getElementById('errorModal'));
        modal.show();
        setTimeout(() => modal.hide(), duration);
    }

    // Function to show confirmation modal
    function showConfirmModal(message, onConfirm) {
        document.getElementById('confirmMessage').textContent = message;
        const modal = new bootstrap.Modal(document.getElementById('confirmModal'));
        document.getElementById('confirmButton').onclick = () => {
            modal.hide();
            onConfirm();
        };
        modal.show();
    }

    // Function to show loading modal
    function showLoadingModal() {
        new bootstrap.Modal(document.getElementById('loadingModal')).show();
    }

    // Function to hide loading modal
    function hideLoadingModal() {
        const loadingModal = bootstrap.Modal.getInstance(document.getElementById('loadingModal'));
        if (loadingModal) {
            loadingModal.hide();
        }
    }
    // Function to show input modal and return a promise
    function showInputModal(title = 'Enter Input', inputType = 'text', placeholder = 'Enter your input here') {
        return new Promise((resolve, reject) => {
            const modal = new bootstrap.Modal(document.getElementById('inputModal'));
            document.getElementById('inputModalTitle').textContent = title;
            const input = document.getElementById('inputModalInput');
            input.type = inputType;
            input.placeholder = placeholder;
            const submitButton = document.getElementById('inputModalSubmit');

            function handleSubmit() {
                modal.hide();
                resolve(input.value);
            }

            submitButton.onclick = handleSubmit;
            input.onkeypress = (e) => {
                if (e.key === 'Enter') {
                    handleSubmit();
                }
            };

            modal.show();
            input.focus();

            // Clear input when modal is hidden
            document.getElementById('inputModal').addEventListener('hidden.bs.modal', function () {
                input.value = '';
                submitButton.onclick = null;
                input.onkeypress = null;
                reject('Modal closed');
            }, {once: true});
        });
    }
</script>

<!--// Hiển thị modal thành công trong 3 giây (mặc định)
showSuccessModal("Operation completed successfully!");

// Hiển thị modal lỗi trong 5 giây
showErrorModal("An error occurred. Please try again.", 5000);
-->