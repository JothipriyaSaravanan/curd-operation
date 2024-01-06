import React, { useState } from "react";
import { Link, useNavigate } from "react-router-dom";
import axios from "axios";

export default function Search() {
  const [id, setId] = useState("");
  const navigate = useNavigate();

  const handleInputChange = (e) => {
    setId(e.target.value);
  };

  const handleSearch = async () => {
    try {
      if (id.trim() === "") {
        alert("Please enter a valid ID.");
      } else {
        // Make an Axios request to verify if the ID exists
        const response = await axios.get(`http://localhost:8081/get/${id}`);

        // Redirect to viewuser/:id
        navigate(`/viewuser/${id}`);
      }
    } catch (error) {
      // Handle 404 error
      if (error.response && error.response.status === 404) {
        alert("User not found. Please enter a valid ID.");
      } else {
        // Handle other errors
        console.error("Error:", error.message);
      }
    }
  };

  return (
    <div className="container">
      <div className="row">
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
          <h2 className="text-center m-4">Search User</h2>

          <div className="mb-3">
            <label htmlFor="userId" className="form-label">
              Enter User ID:
            </label>
            <input
              type="text"
              className="form-control"
              id="userId"
              placeholder="Enter user ID"
              value={id}
              onChange={handleInputChange}
            />
          </div>

          <button
            type="button"
            className="btn btn-outline-primary"
            onClick={handleSearch}
          >
            Search
          </button>

          <Link className="btn btn-outline-primary mx-2" to="/">
            Back to Home
          </Link>
        </div>
      </div>
    </div>
  );
}
