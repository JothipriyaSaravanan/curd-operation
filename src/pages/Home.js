import React, { useEffect, useState } from "react";
import axios from "axios";
import { Link } from "react-router-dom";

export default function Home() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    loadUsers();
  }, []);

  const loadUsers = async () => {
    const result = await axios.get("http://localhost:8081/getAll");
    setUsers(result.data.map(user => ({ ...user, isRead: false })));
  };

  const deleteUser = async (id) => {
    await axios.delete(`http://localhost:8081/delete/${id}`);
    loadUsers();
  };

  const markAsRead = (id) => {
    // Handle mark as read logic (replace this with your logic)
    setUsers(users.map(user => user.id === id ? { ...user, isRead: true } : user));
  };

  return (
    <div className="container">
      <div className="py-4">
        <table className="table border shadow">
          <thead>
            <tr>
              <th scope="col">S.N</th>
              <th scope="col">User Id</th>
              <th scope="col">User Name</th>
              <th scope="col">Action</th>
            </tr>
          </thead>
          <tbody>
            {users.map((user, index) => (
              <tr key={index}>
                <th scope="row">{index + 1}</th>
                <td>{user.id}</td> 
                <td>{user.username}</td>
                
                <td>
                  <Link
                    className="btn btn-primary mx-2"
                    to={`/viewuser/${user.id}`}
                  >
                    View Details
                  </Link>
                  <Link
                    className="btn btn-outline-success mx-2"
                    to={`/edituser/${user.id}`}
                  >
                    Edit
                  </Link>
                  <button
                    className="btn btn-danger mx-2"
                    onClick={() => deleteUser(user.id)}
                  >
                    Delete
                  </button>
                  {!user.isRead && (
                    <button
                      className="btn btn-success mx-2"
                      onClick={() => markAsRead(user.id)}
                    >
                      Mark As Read
                    </button>
                  )}
                 
                  {user.isRead && (
                    <span className="btn btn-success mx-2">
                      Readed
                    </span>
                  )}
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}
